import { Component } from '@angular/core';
import { GLOBAL } from './services/global';
import { Http, Response, Headers, RequestOptions } from '@angular/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Productos Angular 5';
  public url: string;
  public header_color: string;
  greeting = {};

  constructor(public http: Http){
    this.url = GLOBAL.url;
  	this.header_color = GLOBAL.header_color;
    http.get(this.url+'resource').map(res => res.json()).subscribe(data => this.greeting = data);
  }
}
