import React, { useState } from 'react'

export const Login = (props: { onFormSwitch: (arg0: string) => void }) => {
    const [email, setEmail] = useState('')
    const [password, setPassword] = useState('')
    const handleSubmit = (e: { preventDefault: () => void }) => {

        e.preventDefault()
        console.log(email,password)
    }


    return (
        <>
            <form onSubmit={handleSubmit} className='login-form-inputs mb-4 w-full'>
                <div className="email">
                    <input value={email} onChange={(e) => setEmail(e.target.value)} type="email" name="email" placeholder="yourmail@gmail.com" id="email" className='bg-white w-full px-6 pt-2 pb-2 flex items-center leading-8 text-[14px] text-text-color rounded-lg my-4'/>
                </div>
                <div className="password">
                    <input value={password} onChange={(e) => setPassword(e.target.value)} type="password" name="password" placeholder="**********" id="password" className='w-full bg-white px-6 pt-2 pb-2 flex items-center leading-8 text-[14px] text-text-color rounded-lg my-4'/>
                </div>
                <button className='border-none hover:border-none bg-Mountbatten-pink text-white px-6 pt-2 pb-2 font-bold flex justify-center items-center leading-8 text-[14px] w-full transition-all duration-300 ease-in-out hover:bg-Rose-quartz' type="submit">Login</button>
            </form>
            <p className='text-text-color text-[12px]'>Don't have an account? <a onClick={() => props.onFormSwitch('register')}>Register here</a></p>
        </>
    )
}