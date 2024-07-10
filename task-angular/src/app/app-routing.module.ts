import { RouterModule, Routes } from '@angular/router';
import { NgModule } from '@angular/core';
import { LoginComponent } from './auth/components/login/login.component';
import { SignupComponent } from './auth/components/signup/signup.component';

export const routes: Routes = [
    {path: "login", component: LoginComponent},
    {path: "signup", component: SignupComponent},
    {path: "admin", loadChildren:()=> import("./module/admin/admin.module").then(e => e.AdminModule)},
    {path: "employee", loadChildren:()=> import("./module/employee/employee.module").then(e => e.EmployeeModule)} 
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})

export class AppRoutingModule { }
