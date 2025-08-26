const res = fetch("http://localhost:3000/api/v1/user/bulk/?filter=p", {
    headers: {
        Authorization: "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOiI2OGFkYTY4YjBjYTA5YjM2ODQzYzZjZTAiLCJpYXQiOjE3NTYyMTA4Mjh9.-OoSMziRAwd3TvhAqFdLEXjhyhBjJF4wzcBK0DLJwk0"
    }
})
  .then((res) => res.json())
  .then((data) => console.log(data))
  .catch(err => console.log(err))
