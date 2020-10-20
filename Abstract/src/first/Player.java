package first;

public abstract class Player {
		
	abstract void play(int num);
	abstract void stop();

}

abstract class VideoPlayer extends Player{
	
}

class AudioPlayer extends Player{

	@Override
	void play(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		
	}}