
/*
 *@Author: Estevão Alves de Lucena
 *@RA: 816119987
*/ 

import { Component } from '@angular/core';
import { HomePage } from '../home/home';
import { GenerosPage } from '../generos/generos';
import { PopularidadePage } from '../popularidade/popularidade';
import { LancamentoPage } from '../lancamento/lancamento';

@Component({
  templateUrl: 'tabs.html'
})
export class TabsPage {

  tab1Root = HomePage;
  tab2Root = GenerosPage;
  tab3Root = PopularidadePage;
  tab4Root = LancamentoPage;

  constructor() {

  }
}
