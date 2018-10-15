
/*
 *@Author: Estevão Alves de Lucena
 *@RA: 816119987
*/ 

import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { GenerosPage } from './generos';

@NgModule({
  declarations: [
    GenerosPage,
  ],
  imports: [
    IonicPageModule.forChild(GenerosPage),
  ],
})
export class GenerosPageModule {}
