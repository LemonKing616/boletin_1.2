public class Usuario {
    private String nombre;
    private String rol;
    private int experiencia;

    public Usuario(String nombre, String rol, int experiencia) {
        this.nombre = nombre;
        this.rol = rol;
        this.experiencia = experiencia;
    }

    public void realizarAcciones() {
        switch (rol) {
            case "Administrador" -> {
                if (experiencia > 10) {
                    System.out.println("Acceso total concedido");
                } else {
                    System.out.println("Acceso denegado. Se requiere más experiencia.");
                }
            }
            case "Usuario" -> {
                if (experiencia < 1) {
                    System.out.println("Acceso básico concedido");
                } else {
                    System.out.println("Acceso denegado. Ha superado el período de prueba.");
                }
            }
            default -> System.out.println("Rol no reconocido. Acceso denegado.");
        }
    }

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Juan", "Administrador", 12);
        usuario1.realizarAcciones();

        Usuario usuario2 = new Usuario("María", "Usuario", 0);
        usuario2.realizarAcciones();

        Usuario usuario3 = new Usuario("Pedro", "Desarrollador", 5);
        usuario3.realizarAcciones();
    }
}