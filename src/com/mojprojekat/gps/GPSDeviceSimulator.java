package com.mojprojekat.gps;
import java.util.Random;

// Klasa koja simulira GPS uredjaj
class GPSDeviceSimulator implements Runnable {
	private int deviceId;
	
	public GPSDeviceSimulator(int deviceId) {
		this.deviceId = deviceId;
	}
	
	@Override
	public void run() {
		Random random = new Random();
		while (true) {
			double latitude = -90 + 180 * random.nextDouble();
			double longitude = -180 + 360 * random.nextDouble();
			System.out.println("Uredjaj " + deviceId + " - Latitude: " + latitude + ", Longitude: " + longitude);
			try {
				Thread.sleep(1000); // Simulira interval izmedju slanja 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


public static void main(String[] args) {
    int numberOfDevices = 500; // Broj GPS uređaja
    for (int i = 0; i < numberOfDevices; i++) {
        Thread deviceThread = new Thread(new GPSDeviceSimulator(i));
        deviceThread.start();
    }
}

}