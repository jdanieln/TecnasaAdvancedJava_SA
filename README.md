<h3>
  Trabajo de clase
</h3>
<p>
    Documentaci�n del ejercicio realizando buenas pr�cticas de POO (SOLID)
</p>
<p>
    En la carpeta "exercise" y en la clase OrderManager no se estaban cumpliendo
    los siguientes principios: principio de responsabilidad �nica, el principio de abierto y cerrado 
    y el principio de invers�on de dependencias.
</p>
<p>
    En el siguiente c�digo se viola el SRP y OCP:
</p>
<code>
    public void processOrder(Order order) {
        invoiceGenerator.generateInvoice(order);
        emailService.sendEmail(order.getCustomerEmail(), "Your order has been processed.");
        smsService.sendSMS(order.getCustomerPhone(), "Your order has been processed.");
    }
</code>
<p>
    En esa clase se genera una factura, luego env�a un correo electronico de notificaci�n y
    luego env�a un mensaje. Adem�s de tener m�s de una responsabilidad, para implementar
    otro tipo de notificaciones deber�amos modificar el c�digo lo cual se incumple tambi�n
    el principio de abierto y cerrado.
</p>
<br>
<p>
    El principio de inversi�n de dependecias consta de que los modulos de alto nivel
    no deben depender de los de bajo nivel , sino de abstracciones y las abstracciones no
    deben depender de los detalles, sino estos mismos de abstracciones.
</p>
<code>
    public class OrderManager {
    private EmailService emailService;
    private SMSService smsService;
    private InvoiceGenerator invoiceGenerator;

    public OrderManager() {
        this.emailService = new EmailService();
        this.smsService = new SMSService();
        this.invoiceGenerator = new InvoiceGenerator();
    }
</code>
<p>
    La clase <strong>OrderManager</strong> depende de las clases concretas 
    <strong>EmailService y SMSService</strong>, por lo tanto; es necesario 
    introducir una clase abstracta o una interfaz que defina el comportamiento general de 
    enviar notificaciones.
</p>
<h1>Soluci�n</h1>
<p>
    Se crea una interfaz <strong>NotificationService,</strong> en la que se
    define el contrato para todos los servicios de notificaci�n.
</p>
<p>
    Luego en <strong>EmailService y SMSService</strong> se implementa la interfaz
    donde se asegura que ambas clases tengan el m�todo para enviar la notificaci�n
</p>
<p>
    En la clase <strong>OrderManager</strong> eliminamos la dependencia de directa
    con las clases de <strong>EmailService y SMSService.</strong> Luego se agrega un atributo para
    almacenar una lista de servicios de notificaci�n, se modifica el constructor para recibir la lista
    y el m�todo <strong>processOrder</strong> para iterar sobre la lista de servicios de notificaci�n
    y llamar al metodo <strong>sendNotification.</strong>
</p>
