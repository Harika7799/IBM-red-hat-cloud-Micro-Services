import React from 'react';

import NewExpense from './components/NewExpense/NewExpense';
import Expenses from './components/Expenses/Expenses';

const App = () => {
    const expenses = [
        {
            id: 'e1',
            title: 'Hair dryer',
            amount: 94.12,
            date: new Date(2021, 7, 31),
        },
        { id: 'e2', title: 'Mac-One', amount: 799.49, date: new Date(2020, 9, 12) },
        {
            id: 'e3',
            title: 'Coffe Maker',
            amount: 294.67,
            date: new Date(2021, 2, 28),
        },
        {
            id: 'e4',
            title: 'Key-chair',
            amount: 450,
            date: new Date(2021, 5, 12),
        },
    ];

    return (
        <div>
            <NewExpense />
            <Expenses items={expenses} />
        </div>
    );
}

export default App;
