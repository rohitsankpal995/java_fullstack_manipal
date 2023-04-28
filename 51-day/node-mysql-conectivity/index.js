const mysql = require('mysql')

const connection = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "Rohit@2000"
})

connection.connect(err => {
    if(err) {
        console.log(`❌ Problem In Connectivity`)
        return
    }
    console.log(`✅ Connected Successfully`)
})
