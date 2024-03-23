import React, { useState } from 'react'
export const Register = (props: { onFormSwitch: (arg0: string) => void }) => {
    const [email, setEmail] = useState('')
    const [password, setPassword] = useState('')
    const [name, setName] = useState('')

    const handleSubmit = (e: { preventDefault: () => void }) => {
        
    }
    function onFormSwitch(_arg0: string): void {
        throw new Error('Function not implemented.')
    }

    return (
        <>
            {/* <form onSubmit={handleSubmit}>
            <label htmlFor="name">Full Name</label>
            <input value={name} onChange={(e) => setName(e.target.value)} type="text" name="name" placeholder="Full name" id="name"/>
            <label htmlFor="email">email</label>
            <input value={email} onChange={(e) => setEmail(e.target.value)} type="email" name="email" placeholder="yourmail@gmail.com" id="email"/>
            <label htmlFor="password">password</label>
            <input value={password} onChange={(e) => setPassword(e.target.value)} type="password" name="password" placeholder="**********" id="password"/>
            <button type="submit">Login</button>
            </form>
            <button onClick={() => props.onFormSwitch('login')}>If have an account? Login here</button> */}

            <form onSubmit={handleSubmit} className='register-form-inputs mb-4 w-full'>
                <div className="name">
                    <input value={name} onChange={(e) => setName(e.target.value)} type="name" name="name" placeholder="Full name" id="name" className='bg-white w-full px-6 pt-2 pb-2 flex items-center leading-8 text-[14px] text-text-color rounded-lg my-4'/>
                </div>
                <div className="email">
                    <input value={email} onChange={(e) => setEmail(e.target.value)} type="email" name="email" placeholder="yourmail@gmail.com" id="email" className='bg-white w-full px-6 pt-2 pb-2 flex items-center leading-8 text-[14px] text-text-color rounded-lg my-4'/>
                </div>
                <div className="password">
                    <input value={password} onChange={(e) => setPassword(e.target.value)} type="password" name="password" placeholder="**********" id="password" className='w-full bg-white px-6 pt-2 pb-2 flex items-center leading-8 text-[14px] text-text-color rounded-lg my-4'/>
                </div>
                <button className='bg-Mountbatten-pink text-white px-6 pt-2 pb-2 font-bold flex justify-center items-center leading-8 text-[14px] w-full transition-all duration-300 ease-in-out hover:bg-Rose-quartz border-none hover:border-none' type="submit">Register</button>
            </form>
            <p className='text-text-color text-[12px]'>If you have an account? <a onClick={() => props.onFormSwitch('login')}>Login here</a></p>
        </>
    )
}