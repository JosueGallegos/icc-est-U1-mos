public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Metodo de ordenamiento Seleccion: ");
        MetodosOrdenamiento metodosOrdenamiento = new MetodosOrdenamiento();
        
        int[] arreglo = {10, 5, 8, 2, 0};
    
        metodosOrdenamiento.printArreglo(arreglo);
        System.out.println("");
       
        metodosOrdenamiento.sortBySeleccionDesOrasc(arreglo, true);
        metodosOrdenamiento.printArreglo(arreglo);
        System.out.println("");

        int[] arreglos = {10, 5, 8, 2, 0};
        metodosOrdenamiento.sortBySeleccionDesOrasc(arreglos, false);
        metodosOrdenamiento.printArreglo(arreglos);

      

       

       


        
        
        
        
    }
}
