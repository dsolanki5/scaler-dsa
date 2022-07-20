package Recursions.LoveBabbar_Recursions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1
 * @author Deepak Solanki
 *
 */
public class RatInMaze {
	
	public static int moveR_D_Count(int r, int c, int n) {
		if(r == n-1 || c == n-1) {
			return 1;
		}
		
		int rightMove=0;
		int downMove=0;
		if(c<n) 
		{
			rightMove = moveR_D_Count(r, c+1, n);
		}
		
		if(r < n)
		{
			downMove = moveR_D_Count(r+1, c, n);
		}
		
		return rightMove + downMove;
	}
	
	public static void moveR_D_Print(int r, int c, int n, String dir) {
		if(r == n-1 && c == n-1) {
			System.out.println(dir);
			return;
		}
		
		if(c < n) {
			moveR_D_Print(r, c+1, n, dir+'H');
		}
		
		if(r < n) {
			moveR_D_Print(r+1, c, n, dir+'V');
		}
		
		if(r<n && c<n) {
			moveR_D_Print(r+1, c+1, n, dir+'D');
		}
	}
	
	public static void mazeWithObstacles(boolean[][] board, String dir, int n, int r, int c) {
		if(board[r][c] && r == n-1 && c == n-1) {
			System.out.println(dir);
			return;
		}
		if(r<n && c<n && !board[r][c]) {
//			mazeWithObstacles(board, dir, n, r, c+1);
			return;
		}
		
		if(c<n-1) {
			mazeWithObstacles(board, dir+'R', n, r, c+1);
		}
		
		if(r<n-1) {
			mazeWithObstacles(board, dir+'D', n, r+1, c);
		}
		
//		if(r<n && c<n) {
//			mazeWithObstacles(board, dir+'D', n, r+1, c+1);
//		}
	}
	
	public static void mazeWithAllPaths(boolean[][] maze, int r, int c, String p) {
		
		if(r == maze.length-1 && c == maze[0].length-1 && !maze[r][c]) {
			System.out.println(p);
			return;
		}
		if(!maze[r][c]) {
			return;
		}
				
		maze[r][c] = false;
		
		if(r<maze.length-1) {
			mazeWithAllPaths(maze, r+1, c, p+'D');
		}
		
		if(c<maze[0].length-1) {
			mazeWithAllPaths(maze, r, c+1, p+'R');
		}
		
		if(r>0) {
			mazeWithAllPaths(maze, r-1, c, p+'U');
		}
		
		if(c>0) {
			mazeWithAllPaths(maze, r, c-1, p+'L');
		}
		
		maze[r][c] = true;
		
	}
	
	public static void printMazeWithAllPaths(boolean[][] maze, int r, int c, String dir, int[][]paths, int stepNo) {
		if(r == maze.length-1 && c == maze.length-1) {
			paths[r][c] = stepNo;
			System.out.println(dir);
			for(int[] arr : paths)
			{
				System.out.println(Arrays.toString(arr));
			}
			System.out.println();
			return;
		}
		
		if(!maze[r][c]) {
			return;
		}
		
		maze[r][c] = false;
		paths[r][c] = stepNo;
		
		if(r<maze.length-1) {
			printMazeWithAllPaths(maze, r+1, c, dir+'D', paths, stepNo+1);
		}
		
		if(c<maze[0].length-1) {
			printMazeWithAllPaths(maze, r, c+1, dir+'R', paths, stepNo+1);
		}
		
		if(r>0) {
			printMazeWithAllPaths(maze, r-1, c, dir+'U', paths, stepNo+1);
		}
		
		if(c>0) {
			printMazeWithAllPaths(maze, r, c-1, dir+'L', paths, stepNo+1);
		}
		
		maze[r][c] = true;
		paths[r][c] = 0;
	}
	
	public static ArrayList<String> findPathGFG(int[][] m, int n) {
		ArrayList<String> ans = new ArrayList<>();
        if(m[0][0] == 0){
            return ans;
        }
        if(m[n-1][n-1] == 0) {
            ans.add("-1");
            return ans;
        }
        
        boolean[][] visited = new boolean[n][n];
        
        solveGFG(m, n, 0, 0, "", ans, visited);
        
        Collections.sort(ans);
        
        return ans;
    }
	
	public static void solveGFG(int[][]m, int n, int r, int c, String paths, ArrayList<String>ans, boolean[][] visited) {
		if(r<0 || r>=n || c<0 || c>=n || m[r][c] == 0 || visited[r][c] == true) {
            return;
        }
       
        if(r == n-1 && c == n-1) {
            ans.add(paths);
        }
        
        // if(m[r][c] == 0) {
        //     return;
        // }
        
        // m[r][c] = 0;
        visited[r][c] = true;
        
        //Down
        if(r>=0 && r<n) {
            
        	solveGFG(m, n, r+1, c, paths+'D', ans, visited);
            
        }
        
        //Right
        if(c>=0 && c<n) {
            
        	solveGFG(m, n, r, c+1, paths+'R', ans, visited);
            
        }
        
        //Up 
        if(r>0 && r<n) {
            
        	solveGFG(m, n, r-1, c, paths+'U', ans, visited);
            
        }
        
        //Left
        if(c>0 && c<n) {
            
        	solveGFG(m, n, r, c-1, paths+'L', ans, visited);
            
        }
        
        // m[r][c] = 1;
        visited[r][c] = false;
    }

	public static void main(String[] args) {
//		int n = 2; //nxn matrix
//		System.out.println("Moving only Right and Down: "+moveR_D_Count(0,0,3));
//		System.out.println("Printing Moves for Right and Down: ");
//		moveR_D_Print(0, 0, 3, "");
		
//		boolean[][] board = {
//                {true, true, true},
//                {true, true, true},
//                {true, true, true}
//        };
		boolean[][] board = {
                {true, false},
                {true, false}
            };
//		System.out.println("Maze with obstacles : ");
//		mazeWithObstacles(board,"",n, 0, 0);
		
//		System.out.println("Maze with All Paths: ");
//		mazeWithAllPaths(board, 0,0,"");
		
//		System.out.println("Print the Maze with All Paths: ");
//		int[][] paths = new int[board.length][board[0].length];
//		int stepNo=1;
//		printMazeWithAllPaths(board, 0,0,"", paths, stepNo);
//		
//		String pat = "DRDD";
//		pat = pat.substring(0,pat.length());
//		System.out.println(pat);
		
		int[][] m = 
			{	 {1, 0, 0, 0},
		         {1, 1, 0, 1}, 
		         {1, 1, 0, 0},
		         {0, 1, 1, 1}
		       };
		
		int n = m.length;		
		System.out.println(findPathGFG(m, n));
	}

}
