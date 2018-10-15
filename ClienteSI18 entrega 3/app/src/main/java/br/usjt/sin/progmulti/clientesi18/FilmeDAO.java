package br.usjt.sin.progmulti.clientesi18;

/*@Author: Vinicius Ferreira
 *RA: 817127791
 */

public class FilmeDAO {

    private static Filme[] filmes;

    private FilmeDAO(){

    }

    public static Filme[] getFilmes(){
        if(filmes == null){

            filmes = new Filme[12];
            filmes[0] = new Filme(1,"maze runner","Ação","18/09/2014");
            filmes[1] = new Filme(2,"papillon","Drama","05/10/2018");
            filmes[2] = new Filme(3,"cinderela e o principe secreto","Animação","11/10/2018");
            filmes[3] = new Filme(4,"chacrinha","Comédia","25/10/2018");
            filmes[4] = new Filme(5,"halloween","Terror","25/10/2018");
            filmes[5] = new Filme(6,"bohemian rhapsody","Biografia, Drama","01/11/2018");
            filmes[6] = new Filme(7,"o doutrinador","Ação","01/11/2018");
            filmes[7] = new Filme(8,"o grinch","Animação, Comédia","08/11/2018");
            filmes[8] = new Filme(9,"operacao overlord","Ação, Mistério, Terror","08/11/2018");
            filmes[9] = new Filme(10,"refem do jogo","Ação","15/11/2018");
            filmes[10] = new Filme(11,"a vida em si","Drama, Romance","06/12/2018");
            filmes[11] = new Filme(12,"bumblebee","Ação, Aventura, Ficção-científica","25/12/2018");
        }

        return filmes;
    }

}
