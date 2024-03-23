/** @type {import('tailwindcss').Config} */
export default {
  content: [
    "./index.html",
    "./src/**/*.{js,ts,jsx,tsx}",
  ],
  theme: {
    borderRadius: {
      'none': '0',
      'sm': '0.125rem',
      DEFAULT: '0.25rem',
      DEFAULT: '4px',
      'md': '0.375rem',
      'lg': '0.5rem',
      'full': '9999px',
      'large': '30px',
    },
    extend: {
      colors: {
        'regal-blue': '#243c5a',
        'text-color': '#192A51',
        'Mountbatten-pink': '#967AA1',
        'Rose-quartz': '#aaa1c8',
        'Thistle': '#D5C6E0',
        'Lavender-blush': "#F5E6E8",
        'dark': '#333333',
        'Misty-rose': '#F1DEDE',
      },
      backgroundImage: {
        'login': "url('./src/assets/login-img.jpg')",
      }
    },
  },
  plugins: [],
}

