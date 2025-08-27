// Dark Mode Toggle
document.addEventListener('DOMContentLoaded', () => {
  const darkModeToggle = document.getElementById('darkModeToggle');
  const body = document.body;

  // Check for saved dark mode preference
  const darkMode = localStorage.getItem('darkMode');
  if (darkMode === 'true') {
    body.classList.add('dark-mode');
    darkModeToggle.textContent = '☀ Light Mode';
  }

  // Event listener toggle
  darkModeToggle.addEventListener('click', () => {
    body.classList.toggle('dark-mode');

    // Update button text 
    if (body.classList.contains('dark-mode')) {
      darkModeToggle.textContent = '☀ Light Mode';
    } else {
      darkModeToggle.textContent = '🌙 Dark Mode';
    }

    // Save preference
    localStorage.setItem('darkMode', body.classList.contains('dark-mode'));
  });

  // Scroll to Top Button
  const scrollToTopBtn = document.getElementById('scrollToTop');

  // Show/hide button on scroll
  window.addEventListener('scroll', () => {
    if (window.scrollY > 200) {
      scrollToTopBtn.style.display = 'block';
    } else {
      scrollToTopBtn.style.display = 'none';
    }
  });

  // Scroll to top on click
  scrollToTopBtn.addEventListener('click', () => {
    window.scrollTo({
      top: 0,
      behavior: 'smooth'
    });
  });
});
