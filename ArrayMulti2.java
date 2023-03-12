public class ArrayMulti2 {
    public static void main(String[] args) {
        String[] tiposVeiculos = {"Carros", "Motos", "Barcos"};
        String[][] marcas =
                {
                        {"WW", "AUDI", "BMW"},
                        {"HONDA", "YAMAHA", "KAWASAKI"},
                        {"MARCA 1", "MARCA 2", "MARCA 3"}
                };
        String[][][] veiculos =
                {
                        {{"Golf", "Polo", "Gol"}, {"A1", "A2", "A3"}, {"Z1", "Z2", "Z3"}},
                        {{"CG", "HORNET", "RR"}, {"R1", "R2", "R3"}, {"T5", "T7", "T4"}},
                        {{"L6", "L3", "L1"}, {"J7", "J8", "J9"}, {"33", "44", "55"}}
                };

        for (int i=0;i<veiculos.length;i++){
            System.out.println(tiposVeiculos[i]);
            for (int j=0;j< veiculos[i].length;j++){
                System.out.println(marcas[i][j]);
                for (int x=0;x<veiculos[i][j].length;x++){
                    System.out.println(" "+ veiculos[i][j][x] + " ");}}}}
    }