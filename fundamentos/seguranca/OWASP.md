# OWASP Top 10 (2021) — Principais Riscos em Aplicações Web

### Broken Access Control
Problema: Permite que usuários acessem dados ou funcionalidades que não deveriam.<br>
Solução: Implemente checagens robustas de permissões no backend, não só no frontend.

### Cryptographic Failures
Problema: Uso incorreto ou ausência de criptografia.<br>
Solução: Use HTTPS, criptografia forte (como AES-256) e evite algoritmos obsoletos (MD5, SHA1).

### Injection
Problema: Como SQL Injection, onde comandos maliciosos são inseridos em consultas.<br>
Solução: Use ORM seguro, prepared statements, e nunca concatene diretamente entradas do usuário em comandos.

### Insecure Design
Problema: Arquitetura e lógica insegura, como permissões mal definidas.<br>
Solução: Adote threat modeling e secure by design desde o início.

### Security Misconfiguration
Problema: Como deixar portas abertas, verbose errors ou configs padrão.<br>
Solução: Faça hardening do servidor, desabilite funcionalidades desnecessárias e revise configurações.

### Vulnerable and Outdated Components
Problema: Uso de bibliotecas com falhas conhecidas.<br>
Solução: Mantenha dependências atualizadas e use ferramentas como OWASP Dependency-Check.

### Identification and Authentication Failures
Problema: Problemas com autenticação e gestão de sessões.<br>
Solução: Implemente MFA, políticas de senha forte e timeout de sessão.

### Software and Data Integrity Failures
Problema: Falta de verificação de integridade em código e dados.<br>
Solução: Use assinaturas digitais e pipelines CI/CD seguros.

### Security Logging and Monitoring Failures
Problema: Falta de logs ou monitoramento de atividades suspeitas.<br>
Solução: Implemente logs auditáveis e alertas de incidentes.

### Server-Side Request Forgery (SSRF)
Problema: Aplicações que buscam recursos internos de forma não validada.<br>
Solução: Valide URLs de destino e restrinja acesso a redes internas.