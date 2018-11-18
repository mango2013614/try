import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ToDo List';
  todos = [
    {
      event: 'Show list',
      done: true},
    {
      event: 'Add new event',
      done: true},
    {
      event: 'Delete event',
      done: true
    },
    {
      event: 'Change type',
      done: true}
  ];

  addTodo(newTodoevent) {
    const newTodo = {
      event: newTodoevent,
      done: false};
    this.todos.push(newTodo);
  }

  deleteEvent(todo) {
    this.todos = this.todos.filter( item => item.event !== todo.event);
  }

  changetype(todo) {
    this.todos = this.todos.filter( item => item.done = true);
  }
}
