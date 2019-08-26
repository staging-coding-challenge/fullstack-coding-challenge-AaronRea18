import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ReactiveFormsModule, FormsModule }    from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { GroceryListComponent } from './grocery-list/grocery-list.component';
import { GroceryListsComponent } from './grocery-lists/grocery-lists.component';


const routes: Routes = [
  { path: '', redirectTo: '/GroceryLists', pathMatch: 'full' },
  
  { path: 'GroceryLists', component: GroceryListsComponent },
  { path: 'GroceryList', component: GroceryListComponent }
];
@NgModule({
  declarations: [
    AppComponent,
    GroceryListsComponent,
    GroceryListComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes),
    ReactiveFormsModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
