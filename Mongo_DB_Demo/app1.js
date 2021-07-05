const mongoose = require('mongoose');
 
mongoose.connect('mongodb://localhost/employee')
  .then(() => console.log('Connected to MongoDB...'))
  .catch(err => console.error('Could not connect to MongoDB...', err));
 
const Author = mongoose.model('Employees', new mongoose.Schema({
  firstName: String,
  lastName: String,
  email: String
}));
 
async function createAuthor(firstName, lastName, email) { 
  const author = new Author({
    firstName, 
    lastName, 
    email 
  });
 
  const result = await employees.save();
  console.log(result);
}
async function displayEmployees()
{
    return await Employee.find();
    
}
 
async function listEmployees() { 
    const employees = await Employees
      .find()
      .select('name');
      console.log(Employees);
  }



 
createEmployees('A-11', 'My bio-11', 'My Website-11');
createEmployees('Honey', 'Virtual', 'https://honey.com');
 
// createCourse('Node Course', 'authorId')
 
// listCourses();
listEmployees();