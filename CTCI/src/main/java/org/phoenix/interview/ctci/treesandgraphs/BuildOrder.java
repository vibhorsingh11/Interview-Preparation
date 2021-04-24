package org.phoenix.interview.ctci.treesandgraphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * You are given a list of projects and a list of dependencies (which is a list of pairs of
 * projects, where the second project is dependent on the first project). All of a project's dependencies
 * must be built before the project is. Find a build order that will allow the projects to be built. If there
 * is no valid build order, return an error.
 * EXAMPLE
 * Input:
 * projects: a, b, c, d, e, f
 * dependencies: (a, d), (f, b), (b, d), (f, a), (d, c)
 * Output: f, e, a, b, d, c
 */

public class BuildOrder {
    public static List<Integer> buildOrder(int[][] projects) {
        Set<Integer> tempMarks = new HashSet<>();
        Set<Integer> permMarks = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < projects.length; i++) {
            if (!permMarks.contains(i)) {
                visit(i, projects, permMarks, tempMarks, res);
            }
        }
        return res;
    }

    private static void visit(int project, int[][] projects, Set<Integer> permMarks, Set<Integer> tempMarks, List<Integer> res) {
        // Check for cycle
        if (tempMarks.contains(project)) {
            throw new RuntimeException("Cycle Detected");
        }
        // If the node is never visited yet
        if (!permMarks.contains(project)) {
            // Add it to the temporary marks
            tempMarks.add(project);
            // Get dependencies of current project
            for (int i : projects[project]) {
                // Recursively visit this node
                visit(i, projects, tempMarks, permMarks, res);
            }
            // At this point, the current project is permanently marked
            permMarks.add(project);
            // Remove it from temporary marks
            tempMarks.remove(project);
            // Add it to the result
            res.add(project);
        }
    }

    public static void main(String[] args) {
        int[][] projects = new int[][]{
                {},
                {0},
                {0},
                {1, 2},
                {3}
        };
        System.out.println(buildOrder(projects));
    }
}
