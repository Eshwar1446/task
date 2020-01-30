package com.xworkz.rocket.threads;

public class Labour {

		private String name;
		private int experience;
		
		private ThreadImpl threadImpl;
		
		public Labour(String name) {
			this.name=name;
			System.out.println("created\t"+name);
		}
		public void setExperience(int experience) {
			this.experience=experience;
			System.out.println("invoked setExperience\t"+experience);
		}
		public void setThreadImpl(ThreadImpl threadImpl) {
			this.threadImpl=threadImpl;
			System.out.println("invoked setThreadImpl\t"+threadImpl);
		}
		public void work() {
			this.threadImpl.start();
			this.threadImpl.run();
		}
}
