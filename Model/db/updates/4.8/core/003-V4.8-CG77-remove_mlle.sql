-- Remove uses of "MISS" (and use "MADAM" instead)
UPDATE adult SET title = 'MADAM'  Where title = 'MISS';
