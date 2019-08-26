import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ConnectionServiceService {
  list: any;

  constructor() { }

  getCurrentUser(): List {
    return this.list.value;
  }

  register(list: List): Observable<List> {
    list.role = 'list';
    return this.http.post<List>(environment.url + '/auth/users/', list, httpOptions)
      // .pipe(catchError(this.handleError));
  }

  getAllLists(): Observable<List[]> {
    return this.http.get<List[]>(environment.url + '/auth/users/', httpOptions)
      // .pipe(catchError(this.handleError));
  }

  updateProfile(list: List): Observable<List> {
    return this.http.put<List>(environment.url + '/auth/users/', list, httpOptions)
      // .pipe(catchError(this.handleError));
  }
}
