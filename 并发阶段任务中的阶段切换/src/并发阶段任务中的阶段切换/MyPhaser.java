package 并发阶段任务中的阶段切换;

import java.util.concurrent.Phaser;

public class MyPhaser extends Phaser{
	protected boolean onAdvance(int phase, int registeredParties) {
		switch(phase) {
		case 0:
			return studentsArrived();
		case 1:
			return finishFirstExercise();
		case 2:
			return finishSecondExercise();
		case 3:
			return finishExam();
		default:
			return true;
				
		}
	}

	private boolean finishExam() {
		// TODO Auto-generated method stub
		System.out.printf("Phaser: All the students have finished the  exam\n");
		System.out.printf("Phaser: Thank you for your time \n");
		return true;
	}

	private boolean finishSecondExercise() {
		// TODO Auto-generated method stub
		System.out.printf("Phaser: All the students have finished the second exercise\n");
		System.out.printf("Phaser: It's time for the third one \n");
		return false;
	}

	private boolean finishFirstExercise() {
		// TODO Auto-generated method stub
		System.out.printf("Phaser: All the students have finished the first exercise\n");
		System.out.printf("Phaser: It's time for the seconfd one \n");
		return false;
	}

	private boolean studentsArrived() {
		// TODO Auto-generated method stub
		System.out.printf("phaser: THe exan are going to start:The student aer readt\n");
		System.out.printf("Phaser: we have %d student.\n", getRegisteredParties());
		return false;
	}

}
