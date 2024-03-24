import React, { useState } from 'react'
// import reactLogo from './assets/react.svg'
// import viteLogo from '/vite.svg'
import './App.css'
import { Register } from './Register'
import { Login } from './Login'


function App() {
  const [currentForm, setCurrentForm] = useState('login')

  const toggleForm = (forName: React.SetStateAction<string>) => {
    setCurrentForm(forName)
  }

  return (
    < >
    <div className="app w-full lg: shadow-xl bg-gradient-to-r min-w-full md:min-w-[900px] from-[#ffffff] to-[#f3e4ff] border-2 border-white p-1 rounded-lg md:rounded-large">
      <div className="grid grid-cols-1 md:grid-cols-2 rounded-large">
        <div className='rounded-lg md:rounded-large w-full col-span-1 bg-login min-h-[150px] md:min-h-full'>

        </div>
        <div className='min-w-[300px] w-full col-span-1 py-6 px-6 md:px-10 flex flex-col items-center'>
          <div className="flex justify-center md:justify-end text-text-color w-full">
            <p className='text-text-color text-[12px]'>Not a member? <a className='text-' onClick={() => toggleForm('register')}>Register now</a></p>
          </div>
          <div className='login-form-container w-full pt-10 md:pt-20 pb-10 mx-0 flex flex-col items-center'>
            <div className='login-form-header mb-6'>
              <h2 className='text-text-color text-3xl font-medium mb-2'>Hello Again!</h2>
              <p className='text-[14px] text-dark'>Welcome back you've been missed!</p>
            </div>
            <div className="form-container w-full px-0 md:px-6">
              {
              currentForm === 'login' ? <Login onFormSwitch={toggleForm}/> : <Register onFormSwitch={toggleForm}/>
              }
            </div>
          </div>
        </div>
      </div>
    </div>
    </>
  )
}

export default App
