import React, { useState, useEffect } from "react";

const Greeting = () => {
  const [message, setMessage] = useState("");

  // get url from the window object
  const url = window.location.href;
  console.log(url);

  useEffect(() => {
    fetch(url + "hello")
      .then((response) => response.json())
      .then((data) => setMessage(data.message))
      .catch((error) => console.error(error));
  }, []);

  return (
    <div>
      <h1>Greeting Component</h1>
      <p>{message}</p>
    </div>
  );
};

export default Greeting;
