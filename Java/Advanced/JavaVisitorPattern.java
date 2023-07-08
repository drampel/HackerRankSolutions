package Java.Advanced;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

enum Color {
    RED, GREEN
}

abstract class Tree {
    private final int value;
    private final Color color;
    private final int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return this.value;
    }

    public Color getColor() {
        return this.color;
    }

    public int getDepth() {
        return this.depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {
    private final ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);
        for (Tree child : children) child.accept(visitor);
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {
    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis {
    public abstract int getResult();

    public abstract void visitNode(TreeNode node);

    public abstract void visitLeaf(TreeLeaf leaf);
}

class SumInLeavesVisitor extends TreeVis {
    private int leavesValuesSum = 0;

    public int getResult() {
        return leavesValuesSum;
    }

    public void visitNode(TreeNode node) {
    }

    public void visitLeaf(TreeLeaf leaf) {
        leavesValuesSum += leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    private long redLeavesValuesMultiplication = 1;
    private final int module = 1000000007;

    public int getResult() {
        return (int) redLeavesValuesMultiplication;
    }

    public void visitNode(TreeNode node) {
        if (node.getColor() == Color.RED)
            redLeavesValuesMultiplication = (redLeavesValuesMultiplication * node.getValue()) % module;
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.RED)
            redLeavesValuesMultiplication = (redLeavesValuesMultiplication * leaf.getValue()) % module;
    }
}

class FancyVisitor extends TreeVis {
    private int nonLeafEvenDepthValuesSum = 0;
    private int greenLeavesValuesSum = 0;

    public int getResult() {
        return Math.abs(nonLeafEvenDepthValuesSum - greenLeavesValuesSum);
    }

    public void visitNode(TreeNode node) {
        if (node.getDepth() % 2 == 0) nonLeafEvenDepthValuesSum += node.getValue();
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.GREEN) greenLeavesValuesSum += leaf.getValue();
    }
}

public class JavaVisitorPattern {
    private static int[] values;
    private static Color[] colors;
    private static Map<Integer, Set<Integer>> mapNodesEdges;

    public static Tree solve() {
        try (Scanner scan = new Scanner(System.in)) {
            int numberNodes = scan.nextInt();
            values = new int[numberNodes];
            colors = new Color[numberNodes];
            mapNodesEdges = new HashMap<>(numberNodes);
            for (int i = 0; i < numberNodes; i++) values[i] = scan.nextInt();
            for (int i = 0; i < numberNodes; i++) colors[i] = scan.nextInt() == 0 ? Color.RED : Color.GREEN;
            for (int i = 0; i < numberNodes - 1; i++) {
                int uNode = scan.nextInt();
                int vNode = scan.nextInt();
                Set<Integer> uNodeEdges = mapNodesEdges.get(uNode);
                if (uNodeEdges == null) {
                    uNodeEdges = new HashSet<>();
                    mapNodesEdges.put(uNode, uNodeEdges);
                }
                uNodeEdges.add(vNode);
                Set<Integer> vNodeEdges = mapNodesEdges.get(vNode);
                if (vNodeEdges == null) {
                    vNodeEdges = new HashSet<>();
                    mapNodesEdges.put(vNode, vNodeEdges);
                }
                vNodeEdges.add(uNode);
            }
            if (numberNodes == 1) return new TreeLeaf(values[0], colors[0], 0);
            TreeNode root = new TreeNode(values[0], colors[0], 0);
            addChildren(root, 1);
            return root;
        }
    }

    private static void addChildren(TreeNode parentNode, Integer parentNodeNumber) {
        for (Integer childNodeNumber : mapNodesEdges.get(parentNodeNumber)) {
            mapNodesEdges.get(childNodeNumber).remove(parentNodeNumber);
            Set<Integer> setChildNodes = mapNodesEdges.get(childNodeNumber);
            Tree childNode;
            if (!setChildNodes.isEmpty())
                childNode = new TreeNode(values[childNodeNumber - 1], colors[childNodeNumber - 1], parentNode.getDepth() + 1);
            else
                childNode = new TreeLeaf(values[childNodeNumber - 1], colors[childNodeNumber - 1], parentNode.getDepth() + 1);
            parentNode.addChild(childNode);
            if (childNode instanceof TreeNode) addChildren((TreeNode) childNode, childNodeNumber);
        }
    }

    public static void main(String[] args) {
        Tree root = solve();
        TreeVis vis1 = new SumInLeavesVisitor();
        TreeVis vis2 = new ProductOfRedNodesVisitor();
        TreeVis vis3 = new FancyVisitor();
        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);
        System.out.printf("%d%n%d%n%d%n", vis1.getResult(), vis2.getResult(), vis3.getResult());
    }
}