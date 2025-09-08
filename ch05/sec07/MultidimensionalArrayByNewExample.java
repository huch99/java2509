package ch05.sec07;

public class MultidimensionalArrayByNewExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mathScores = new int[2][3];
		
		for(int i=0; i<mathScores.length; i++) {
			for(int k=0; k<mathScores[i].length; k++) {
				System.out.println("mathScores[" + i + "][" + k + "] : " + mathScores[i][k]);
			}
		}
		
		System.out.println();
		
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;
		
		int totalStudent = 0;
		int totalMathSum = 0;
		for(int i=0; i<mathScores.length; i++) {
			totalStudent += mathScores[i].length;
			for(int k=0; k<mathScores[i].length; k++) {
				totalMathSum += mathScores[i][k];
			}
		}
		double totalMathAvg = (double) totalMathSum / totalStudent;
		System.out.println("전체 학생의 수학 평균 점수 : " + totalMathAvg);
		System.out.println();
		
		int[][] englishSores = new int[2][];
		englishSores[0] = new int [2];
		englishSores[1] = new int [3];
		
		for(int i=0; i<englishSores.length; i++) {
			for(int k=0; k<englishSores[i].length; k++) {
				System.out.println("englishScores[" + i + "][" + k + "] : " + englishSores[i][k]);
			}
		}
		
		System.out.println();
		
		englishSores[0][0] = 90;
		englishSores[0][1] = 91;
		englishSores[1][0] = 92;
		englishSores[1][1] = 93;
		englishSores[1][2] = 94;
		
		totalStudent = 0;
		int totalEnglishSum = 0;
		for(int i=0; i<englishSores.length; i++) {
			totalStudent += englishSores[i].length;
			for(int k=0; k<englishSores[i].length; k++) {
				totalEnglishSum += englishSores[i][k];
			}
		}
		
		double totalEnglishAvg = (double) totalEnglishSum / totalStudent;
		System.out.println("전체 학생의 영어 평균 점수 : " + totalEnglishAvg);
	}

}
