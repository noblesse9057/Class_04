package com.biz.exec;

import java.util.Scanner;

import com.biz.model.ScoreVO;

public class ScoreExec_02 {

	public static void main(String[] args) {

		/*
		 * ScoreVO �迭�� 5�� �����ϰ� Ű����κ��� 5�� �л��� �й�, ����, ����, ���� ������ �Է¹ް� �� �迭�� ������ �� ����Ʈ��
		 * toString()���� ���̽ÿ�
		 */
		ScoreVO[] sVOs = new ScoreVO[5];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < sVOs.length; i++) {
			sVOs[i] = new ScoreVO();
			System.out.println("�й�>");
			String strNum = scan.nextLine();
			System.out.println("����>");
			String strKor = scan.nextLine();
			int intKor =Integer.valueOf(strKor);
			System.out.println("����>");
			String strEng = scan.nextLine();
			int intEng =Integer.valueOf(strEng);
			System.out.println("����>");
			String strMath = scan.nextLine();
			int intMath =Integer.valueOf(strMath);
			
			sVOs[i].setNumber(strNum);
			sVOs[i].setKor(intKor);
			sVOs[i].setEng(intEng);
			sVOs[i].setMath(intMath);
			
		
			
		}

	}

}
