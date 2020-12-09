import { Proizvod } from './../models/Proizvod';
import { Injectable } from '@angular/core';

import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class KorpaService {

public proizvodi: Array<Proizvod> = new Array<Proizvod>();

constructor(private http: HttpClient) { }

public plati(brojKartice: string): Observable<any>{
  const headers = { 'content-type': 'application/json'};
  let body: any = {
    broj: brojKartice,
    imeKorisnika: 'Amar Ćatović',
    stanje: 1500,
    kolicina: 100,
    prodavnicaId: 1
  };
  body = JSON.stringify(body);
  
  return this.http.post('http://localhost:8080/servis/placanje', body, {'headers':headers});
}

}
