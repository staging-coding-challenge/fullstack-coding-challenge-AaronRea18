import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ConnectionServiceService {

  constructor() { }

  getCurrentUser(): User {
    return this.user.value;
  }

  register(user: User): Observable<User> {
    user.role = 'user';
    return this.http.post<User>(environment.url + '/auth/users/', user, httpOptions)
      .pipe(catchError(this.handleError));
  }

  getAllUsers(): Observable<User[]> {
    return this.http.get<User[]>(environment.url + '/auth/users/', httpOptions)
      .pipe(catchError(this.handleError));
  }

  updateProfile(user: User): Observable<User> {
    return this.http.put<User>(environment.url + '/auth/users/', user, httpOptions)
      .pipe(catchError(this.handleError));
  }
}
