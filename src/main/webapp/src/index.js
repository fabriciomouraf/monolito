import React from 'react';
import ReactDOM from 'react-dom';
import './index.css'; // Assumindo que você tem um arquivo CSS para estilos básicos

// Um componente simples do React
const App = () => (
    <div>
        <h1>Olá, mundo!</h1>
        <p>Bem-vindo ao meu aplicativo React.</p>
    </div>
);

// Renderização do componente App no elemento root do HTML
ReactDOM.render(<App />, document.getElementById('root'));
