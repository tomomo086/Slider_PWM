package pwm;

import com.pi4j.wiringpi.Gpio;
import com.pi4j.wiringpi.SoftPwm;

public class WringPiPwm {

	public static void main(String[] args ) throws InterruptedException {

		int[] ind = new int[] {0, 1, 3, 5, 7, 10, 20, 40, 70, 100};

		//Gpioを初期化
		Gpio.wiringPiSetup();

		//pinをソフトウェアPWM出力ピンとして初期化
		SoftPwm.softPwmCreate(1, 0, 100);

		System.out.println("Starting");


			for(int i = 0; i < 10; i++) {

				//ソフトウェアPWM出力
				SoftPwm.softPwmWrite(1, ind[i]);
				Thread.sleep(500);

			}

			Thread.sleep(1000);

			for(int i = 9; i >= 0; i--) {

				//ソフトウェアPWM出力
				SoftPwm.softPwmWrite(1, ind[i]);
				Thread.sleep(500);
			}


	}

}
