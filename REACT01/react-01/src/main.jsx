import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App.jsx'

import './index.css'
import { createBrowserRouter, RouterProvider } from 'react-router-dom'
import SignInSide from './components/Login/SignIn.jsx'
import Astros from `./components/Astros/Astros.jsx`



const router =createBrowserRouter([
  //aqui voy a crear las rutas . una ruta se compone de dos elementos `path` y  `element`
  {
    path: `/`, element:<App />
  },
  {
  path: `login`, element:<SignInSide/>

  },
  {
    path: `astros-api`, element: <Astros/>
  }
])

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <RouterProvider router ={router}/>

  </React.StrictMode>,
)
