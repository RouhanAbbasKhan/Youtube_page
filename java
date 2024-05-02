// Example: Log a message when the search bar value changes
document.querySelector('.form-control').addEventListener('input', function(event) {
    console.log('Search query changed:', event.target.value);
  });
  
  // Example: Change the video source when a new video is selected
  function changeVideo(videoUrl) {
    document.querySelector('iframe').src = videoUrl;
  }
  
  // Example: Toggle dark mode
  document.querySelector('.navbar-toggler').addEventListener('click', function() {
    document.body.classList.toggle('dark-mode');
  });
  