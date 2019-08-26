import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-grocery-list',
  templateUrl: './grocery-list.component.html',
  styleUrls: ['./grocery-list.component.css']
})
export class GroceryListComponent implements OnInit {
a=false;
item='';
type='';
n=-1;
items=[];
types=[];
 myFunc(a){
   this.a=true;
   this.items.push(this.item+ " is a "+this.type);
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
