public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.INSTANCE;

        logger.log("Erro: Falha na conexão com o banco de dados");
        logger.log("Evento: Usuário logado");
        logger.log("Auditoria: Transação processada");

        // Teste multi-thread
        Thread t1 = new Thread(() -> logger.log("Log from thread 1"));
        Thread t2 = new Thread(() -> logger.log("Log from thread 2"));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
