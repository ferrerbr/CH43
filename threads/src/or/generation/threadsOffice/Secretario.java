package or.generation.threadsOffice;

public class Secretario  extends Thread{
	private int  tareas;
	public Secretario(int tareas) {
		this.tareas = tareas;
	}
	
	@override
	 public void run() {
        for (int i = 0; i < tareas; i++) {
            System.out.println("Secretario: Sacando copias...");
            System.out.println("Secretario: Copias completadas.");
        }
//cuando finaliza imprime que ha terminado
        System.out.println("Secretario: Ha terminado todas las tareas.");
	}

}
