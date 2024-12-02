package models;

public class Cliente extends Persona {

    private int idCliente;
    private int idUsuario;

    public Cliente() {
    }

    public Cliente(Cliente cliente) {
        super(cliente.getNroDocumento(), cliente.getNombre(), cliente.getApellidos(), cliente.getSexo(), cliente.getEdad(), cliente.getTelefono(), cliente.getEstado(), cliente.getFechaCreado(), cliente.getFechaActualizado(),cliente.getIdPersona());
        this.idCliente = cliente.getIdCliente();
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    
}
