const mongoose=require('mongoose');
mongoose.connect('mongodb://localhost/employee',()=>{
    console.log('connection successful');
});
 
/*const courseSchema = new mongoose.Schema({
    name: String,
    author: String, 
    tags: [ String ],
    date: Date, 
    isPublished: Boolean,
    price: Number
  });*/
  const employeeSchema = new mongoose.Schema({
      First_Name : String,
      Last_Name : String,
      Email : String

});
  //const Course = mongoose.model('Course', courseSchema);
  const Employee = mongoose.model('Employee', employeeSchema);
 
/*async function getCourses() {
  return await Course
  .find();
}*/
async function getEmployees() {
    return await Employee
    .find();
}
/*async function run() {
    const courses = await getCourses();
    console.log(courses);
  }*/
  async function run() {
    const employees = await getEmployees();
    console.log(employees);
  }
  
  run();