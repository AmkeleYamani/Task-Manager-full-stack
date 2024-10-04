import { Component } from '@angular/core';
import { AdminService } from '../../services/admin.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-view-task-details',
  templateUrl: './view-task-details.component.html',
  styleUrls: ['./view-task-details.component.scss']
})
export class ViewTaskDetailsComponent {

  taskId: number = this.activatedRoute.snapshot.params["id"];
  taskData: any;

    constructor(private service: AdminService,
      private activatedRoute: ActivatedRoute
    ) {

    }

    ngOnInit() {
      this.getTaskById();
    }

    getTaskById() {
      this.service.getTaskById(this.taskId).subscribe((res)=>{
        this.taskData = res;
      })
    }
}
