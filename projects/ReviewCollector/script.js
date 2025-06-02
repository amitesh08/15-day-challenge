const postBtn = document.getElementById("postBtn");
const reviewInput = document.getElementById("reviewInput");
const reviewList = document.getElementById("reviewList");

postBtn.addEventListener("click", () => {
  const content = reviewInput.value.trim();
  if (content === "") return;

  // Review container
  const reviewItem = document.createElement("div");
  reviewItem.style.display = "flex";
  reviewItem.style.justifyContent = "space-between";
  reviewItem.style.alignItems = "center";
  reviewItem.style.border = "1px solid #ccc";
  reviewItem.style.margin = "10px";
  reviewItem.style.width = "40vw";
  reviewItem.style.padding = "10px 40px";
  reviewItem.style.borderRadius = "8px";
  reviewItem.style.backgroundColor = "#f8f8f8";

  // Text span
  const reviewText = document.createElement("span");
  reviewText.textContent = content;
  reviewText.style.marginRight = "10px";

  // Delete button
  const deleteBtn = document.createElement("button");
  deleteBtn.textContent = "X";
  deleteBtn.style.backgroundColor = "red";
  deleteBtn.style.color = "white";
  deleteBtn.style.border = "none";
  deleteBtn.style.padding = "5px 10px";
  deleteBtn.style.borderRadius = "5px";
  deleteBtn.style.cursor = "pointer";

  // Delete event
  deleteBtn.addEventListener("click", () => {
    reviewList.removeChild(reviewItem);
  });

  // Append children
  reviewItem.appendChild(reviewText);
  reviewItem.appendChild(deleteBtn);

  reviewList.appendChild(reviewItem);
  reviewInput.value = "";
});
