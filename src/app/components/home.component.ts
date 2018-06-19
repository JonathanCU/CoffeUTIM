import { Component } from "@angular/core";
import { routing, appRoutingProviders } from "../app.routing";

@Component({
    selector: 'home',
    templateUrl: 'home.html'
})

export class HomeComponent{
    public titulo:string;

    constructor(){
        this.titulo = "Pagina principal";
    }

    ngOnInit(){
        
    }
}