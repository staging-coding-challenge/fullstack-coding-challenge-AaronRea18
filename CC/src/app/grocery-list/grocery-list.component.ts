import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-grocery-list',
  templateUrl: './grocery-list.component.html',
  styleUrls: ['./grocery-list.component.css']
})
export class GroceryListComponent implements OnInit {
a=false;
item='';
n=-1;
items=[];
 myFunc(a){
   this.a=true;
   this.items.push(this.item);
   console.log(this.a);
 }
 remove(index){
  var removed = this.items.splice(index,1);
   console.log("remove clicked");
   
 }
constructor() { 
  console.log(this.a);
  
 

  }

  ngOnInit() {
  }

}
