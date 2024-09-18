import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { AdminService } from '../../services/admin.service';

@Component({
  selector: 'app-update-task',
  templateUrl: './update-task.component.html',
  styleUrls: ['./update-task.component.scss']
})
export class UpdateTaskComponent {

  id:number = this.route.snapshot.params["id"];

  constructor(private service: AdminService,
    private route: ActivatedRoute
  ) { 
    this.getTaskById();
  }

  getTaskById() {
    this.service.getTaskById(this.id).subscribe((res) =>{
      console.log(res);
    })
  }
}
