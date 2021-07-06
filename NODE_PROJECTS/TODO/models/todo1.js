const Joi = require('joi');
const mongoose = require('mongoose');

const todo1 = mongoose.model('Todo', new mongoose.Schema({
  description: {
    type: String,
    required: true,
    minlength: 5,
    maxlength: 50
  },
  isCompleted: {
    type: Boolean,
    default: false
  },
  
}));

function validateTodo(todo1) {
  const schema = {
    description: Joi.string().min(5).max(50).required(),
    isCompleted: Joi.boolean()
  };

  return Joi.validate(todo1, schema);
}

exports.Todo = Todo; 
exports.validate = validateTodo;