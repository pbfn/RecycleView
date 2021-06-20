package com.br.pedro.bruno.recyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.br.pedro.bruno.recyclerview.R;
import com.br.pedro.bruno.recyclerview.RecyclerItemClickListener;
import com.br.pedro.bruno.recyclerview.adapter.Adapter;
import com.br.pedro.bruno.recyclerview.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //Listagem de filmes

        this.criarFiles();

        //Configurar adapter
        Adapter adapter = new Adapter(listaFilmes);


        //Configurar Recyclerview
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);


        //evento de click

        recyclerView.addOnItemTouchListener(
            new RecyclerItemClickListener(
                    getApplicationContext(),
                    recyclerView,
                    new RecyclerItemClickListener.OnItemClickListener() {
                        @Override
                        public void onItemClick(View view, int position) {
                            Filme filme = listaFilmes.get(position);
                            Toast.makeText(
                                    getApplicationContext(),
                                    "Item pressionado "+filme.getTituloFilme(),
                                    Toast.LENGTH_SHORT
                            ).show();
                        }

                        @Override
                        public void onLongItemClick(View view, int position) {
                            Filme filme = listaFilmes.get(position);
                            Toast.makeText(
                                    getApplicationContext(),
                                    "Clique longo "+filme.getTituloFilme(),
                                    Toast.LENGTH_SHORT
                            ).show();
                        }

                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        }
                    }
            )
        );
    }

    public void criarFiles(){

        Filme filme = new Filme("Filme 1","Gênero 1","2001");
        this.listaFilmes.add(filme);

        filme = new Filme("Filme 2","Gênero 2","2002");
        this.listaFilmes.add(filme);

        filme = new Filme("Filme 3","Gênero 3","2003");
        this.listaFilmes.add(filme);

        filme = new Filme("Filme 4","Gênero 4","2004");
        this.listaFilmes.add(filme);

        filme = new Filme("Filme 5","Gênero 5","2005");
        this.listaFilmes.add(filme);

        filme = new Filme("Filme 6","Gênero 6","2006");
        this.listaFilmes.add(filme);

        filme = new Filme("Filme 6","Gênero 6","2006");
        this.listaFilmes.add(filme);

        filme = new Filme("Filme 6","Gênero 6","2006");
        this.listaFilmes.add(filme);

        filme = new Filme("Filme 6","Gênero 6","2006");
        this.listaFilmes.add(filme);

        filme = new Filme("Filme 6","Gênero 6","2006");
        this.listaFilmes.add(filme);

        filme = new Filme("Filme 6","Gênero 6","2006");
        this.listaFilmes.add(filme);

        filme = new Filme("Filme 6","Gênero 6","2006");
        this.listaFilmes.add(filme);

        filme = new Filme("Filme 6","Gênero 6","2006");
        this.listaFilmes.add(filme);

        filme = new Filme("Filme 6","Gênero 6","2006");
        this.listaFilmes.add(filme);

        filme = new Filme("Filme 6","Gênero 6","2006");
        this.listaFilmes.add(filme);

        filme = new Filme("Filme 6","Gênero 6","2006");
        this.listaFilmes.add(filme);

        filme = new Filme("Filme 6","Gênero 6","2006");
        this.listaFilmes.add(filme);

        filme = new Filme("Filme 6","Gênero 6","2006");
        this.listaFilmes.add(filme);

        filme = new Filme("Filme 6","Gênero 6","2006");
        this.listaFilmes.add(filme);


    }
}