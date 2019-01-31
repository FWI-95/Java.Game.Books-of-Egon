package code;

public class Egon {
	
	static Startmenu startmenu;
	static Einstellungen einstellungen;
	static GameFrame gameframe;
	static GameEngine gameengine;
	
	public static void main(String[] args) {
		
		startmenu = new Startmenu();
		einstellungen = new Einstellungen();
		gameframe = new GameFrame();
		gameengine = new GameEngine();
		
		
		ChangeFrame("Startmenu", true);
		
	}
	
	public static void ChangeFrame(String Window, boolean Visible){
		switch(Window){
		case "Settings":
			einstellungen.setVisible(Visible);
			break;
		case "Startmenu":
			startmenu.setVisible(Visible);
			break;
		case "Gameframe":
			gameframe.setVisible(Visible);
			break;
		}
	}
	
	public static void StartGame(){
		System.out.println("jetzt");
		ChangeFrame("Startmenu", false);
		
		ChangeFrame("Gameframe", true);
		gameengine.start();
	}
	
	public static void KillEngine(){
		gameengine.stop();
	}
}

//Test test = new Test();
//
//test.setVisible(true);
