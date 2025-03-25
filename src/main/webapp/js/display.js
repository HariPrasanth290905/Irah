async function fetchHerbs() {
          try {
              const response = await fetch('/api/herbs');
              const herbs = await response.json();

         //     console.log("Fetched Herbs:", herbs); 
		 
              const herbList = document.getElementById("herb-list");
              herbList.innerHTML = ""; // Clear previous content

              herbs.forEach(herb => {
                  const herbCard = document.createElement("div");
                  herbCard.classList.add("herb-card");

                  herbCard.innerHTML = `
                      <h3>${herb.name}</h3>
                      <p><strong>Scientific Name:</strong> ${herb.sciname}</p>
                      <img src="${herb.imgurl}" alt="${herb.name}">
                      <p><strong>Benefits:</strong> ${herb.benifits}</p>
                      <a href="${herb.modelurl}" target="_blank">View 3D Model</a>
                  `;

                  herbList.appendChild(herbCard);
              });

          } catch (error) {
              console.error("Error fetching herbs:", error);
          }
      }

      document.addEventListener("DOMContentLoaded", fetchHerbs);