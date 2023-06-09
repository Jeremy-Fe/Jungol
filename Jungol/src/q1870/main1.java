package q1870;

import java.util.Scanner;

public class main1 {
	static int N, M;
	static int[][] paper;
	static int NONE = 0;
	static int CHEESE = 1;
	static int MELTING = 2;
	static int MELTED = 3;
	static int VISIT = 5;

	public static void printPaper() {
		System.out.println("------------------------");
		for (int i = 0; i < paper.length; i++) {
			for (int j = 0; j < paper[i].length; j++) {
				System.out.printf(paper[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void initPaper() {
		for (int i = 0; i < paper.length; i++) {
			for (int j = 0; j < paper[i].length; j++) {
				if (paper[i][j] == VISIT || paper[i][j] == MELTED) {
					paper[i][j] = NONE;
				} else if (paper[i][j] == MELTING) {
					paper[i][j] = CHEESE;
				}
			}
		}
	}

	public static int countCheese() {
		int cnt = 0;
		for (int i = 0; i < paper.length; i++) {
			for (int j = 0; j < paper[i].length; j++) {
				if (paper[i][j] == CHEESE || paper[i][j] == MELTING) {
					cnt++;
				}
			}
		}

		return cnt;
	}

	public static void melt(int row, int col) {
		if (paper[row][col] == CHEESE) {
			paper[row][col] = MELTING;
			return;
		} else if (paper[row][col] == MELTING) {
			paper[row][col] = MELTED;
			return;
		} else {
			paper[row][col] = VISIT;
		}

		// UP
		if (row - 1 >= 0
				&& (paper[row - 1][col] == NONE || paper[row - 1][col] == CHEESE || paper[row - 1][col] == MELTING)) {
			melt(row - 1, col);
		}
		// DOWN
		if (row + 1 < N
				&& (paper[row + 1][col] == NONE || paper[row + 1][col] == CHEESE || paper[row + 1][col] == MELTING)) {
			melt(row + 1, col);
		}
		// LEFT
		if (col - 1 >= 0
				&& (paper[row][col - 1] == NONE || paper[row][col - 1] == CHEESE || paper[row][col - 1] == MELTING)) {
			melt(row, col - 1);
		}
		// RIGHT
		if (col + 1 < M
				&& (paper[row][col + 1] == NONE || paper[row][col + 1] == CHEESE || paper[row][col + 1] == MELTING)) {
			melt(row, col + 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		paper = new int[N][M];
		for (int i = 0; i < paper.length; i++) {
			for (int j = 0; j < paper[i].length; j++) {
				paper[i][j] = sc.nextInt();
			}
		}
		sc.close();
//		System.out.println(N + " " + M);

		int ret = 0, cnt = 0;
		do {
			printPaper();
			melt(0, 0);
			printPaper();
			initPaper();
			printPaper();
			ret = countCheese();
			cnt++;
		} while (ret > 0);
		System.out.println(cnt);
	}
}